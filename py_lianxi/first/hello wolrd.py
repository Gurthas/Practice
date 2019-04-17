# -*- coding:utf-8 -*-
class Student(object):

    def __init__(self, name, score):
        self.name = name
        self.score = score

    def print_score(self):
        print '%s: %s' % (self.name, self.score)

hasi = Student('bob', 13)
hasi.print_score()
