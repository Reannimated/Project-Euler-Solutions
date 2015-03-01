"""
Project Euler Problem 22
========================

Using names.txt, a 46K text file containing over five-thousand first names,
begin by sorting it into alphabetical order. Then working out the
alphabetical value for each name, multiply this value by its alphabetical
position in the list to obtain a name score.

For example, when the list is sorted into alphabetical order, COLIN, which
is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So,
COLIN would obtain a score of 938 * 53 = 49714.

What is the total of all the name scores in the file?
"""

def run():
	file = open('resources/names.txt')
	names = sorted(file.read().split(','))
	score = 0
	for i in range(len(names)):
		score += (i + 1) * sum([ord(j) - 64 for j in names[i][1:-1]])
	return score

print run()