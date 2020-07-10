print("interface vxlan 1\n");
print("source ip 21.21.21.1");
print("no shutdown\n");
for i in range(2, 4041):
     print "vni {}".format(i)
     print "    vlan {}".format(i)
