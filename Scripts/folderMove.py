import subprocess
parent_destination = raw_input("Enter Dest Director : ")
for i in range (65, 91):
    dir=chr(i)
    source = parent_destination+"/"+dir+"*"
    destn  = parent_destination+"/"+dir+"/"
    command = "mv "+source+" "+destn
    print command
    subprocess.call(command,shell=True)
#command = "mkdir "+child_destination_2
#subprocess.call(command,shell=True)
