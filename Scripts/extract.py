import subprocess
print "Utility for extracting .JPG and .CR2 images"
folder_1 = "Regular"
folder_2 = "Raw"
source = raw_input("Enter Source Directory : ")
parent_destination = raw_input("Enter Dest Director : ")
child_destination_1 = parent_destination+"/"+folder_1
child_destination_2 = parent_destination+"/"+folder_2
command = "mkdir "+child_destination_1
subprocess.call(command,shell=True)
command = "mkdir "+child_destination_2
subprocess.call(command,shell=True)
from os import listdir
from os.path import isfile, join
files = [f for f in listdir(source) if isfile(join(source, f))]
command=""
for file in files:
    file = file.strip()
    if ".JPG" in file :
        file = source + "/"+file
        command = "mv "+file+" "+child_destination_1+"/"
    elif ".CR2" in file :
        file = source + "/"+file
        command = "mv "+file+" "+child_destination_2+"/"
    subprocess.call(command,shell=True)
