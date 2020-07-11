import subprocess
source = raw_input("Enter Source File : ")
file = open(source)
parent_destination = raw_input("Enter Dest Director : ")
command=""
for line in file:
    line = line.strip()
    image = "*"+line+"*";
    command="cp "+image+" "+parent_destination
    print command
    subprocess.call(command,shell=True)

