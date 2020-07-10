printf("interface vxlan 1\n");
printf("source ip 21.21.21.1");
printf("no shutdown\n");
for i in range(2, 4041):
     print "vni {}".format(i)
     print "    vlan {}".format(i)
     print "    vtep 2.2.2.2"
     print "    vtep 3.3.3.3"
