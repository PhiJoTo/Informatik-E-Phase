import json
import multiprocessing
import xml.etree.ElementTree as ET
from multiprocessing import Pool, freeze_support

teilerBis = 100

numberDict = {}

def teilerBerechnen(number):
  currentTeiler = 1
  for i in range(number):
      if i == 0:
          continue
      if number % (i) == 0:
        currentTeiler+=1
  numberDict[number] = currentTeiler

def main():
  a_pool = multiprocessing.Pool(processes=8)
  a_pool.map(teilerBerechnen, range(teilerBis))

if __name__=="__main__":
    freeze_support()
    main()


print(numberDict)
# assume you have the following dictionary
with open("teiler.json", "w") as write_file:
    json.dump(numberDict, write_file, indent=4)



