#!/usr/bin/expect -f
#This is a script to connect to the switch in Santa Clara lab.
#Provide console number as a argument. Press $ to close the connection.

set console $argv
send "Connecting to the switch in SW-SC lab with console $console ...\n"
spawn ssh sdn@15.214.107.125
expect "password:"
send "skyline\r"
expect "<PASDN-Core>"
send "telnet 15.214.107.124\r"
expect "Login:"
send "InReach\r"
expect "Password:"
send "access\r"
expect "InReach:0 >"
send "connect port async $console\r"
send "\r"
expect {
    "login:" {
        send "admin\r"
        expect "Password:"
        send "\r"
    }
    -re ".*.#" {
        #send "show int br\r"
    }
}
interact $ return
send "~."
expect "closed."
