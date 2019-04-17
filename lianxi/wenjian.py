# coding = utf-8
def caozuo():
    fp = open('xixihaha.txt', 'w+')
    for i in range(5):
        fp.write("memeda"+str(i)+'\n')
    fp.close()


def caozuoxie():
    fp = open('xixihaha.txt', 'r')
    line = fp.readlines()
    print(line)
    fp.close()
caozuo()
caozuoxie()