import math

class Equations:
    def calculate(self,x):
        rad = x * math.pi / 180.0
        try:
        #y=ctg(x)
            y = 1/math.tan(x)
            if rad == math.pi or rad == (math.pi * 2):
                raise Exception
        except Exception as e:
            print("Exeption ",str(e))
            return 0
        return y

