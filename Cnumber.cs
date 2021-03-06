﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;


namespace Kyrsach2018
{
    class Cnumber : AbstractNumber<Cnumber>
    {
        private double rPart, imPart;

        public Cnumber()
        {
            rPart = 1;
            imPart = 1;
        }

        public Cnumber(double rPart, double imPart)
        {
            this.rPart = rPart;
            this.imPart = imPart;
        }

        public double Impart
        {
            get
            {
                return imPart;
            }

            set
            {
                imPart = value;
            }
        }

        public double Rpart
        {
            get
            {
                return rPart;
            }

            set
            {
                rPart = value;
            }
        }

        new public string getSign(double Num)
        {
          return  Math.Sign(Num) == 1 ? "+" : "-";
        }

        public override Cnumber Add(Cnumber Complex)
        {
            return new Cnumber(rPart + Complex.Rpart, imPart + Complex.Impart);
        }

        public override Cnumber Minus(Cnumber Complex)
        {
            return new Cnumber(rPart - Complex.Rpart, imPart - Complex.Impart);
        }

        
       // (a +bi)(d + ni) = a*d + a*ni + b*ni - b*n
        public override Cnumber Multiply(Cnumber Complex)
        {
            return new Cnumber(rPart * Complex.Rpart - imPart * Complex.Impart, rPart * Complex.Impart + imPart * Complex.Rpart);
        }

      //  (a+bi)/(c+di) = (ac + bd)/(c^2 + d^2) + i(bc - ad)/(c^2 + d^2)
        public override Cnumber Division(Cnumber Complex)
        {
            if ((Complex.Impart + Complex.Rpart) == 0)
            {
                Console.WriteLine("division by 0");
                return null;
            }
            return new Cnumber((rPart * Complex.Rpart + imPart * Complex.Impart) / (Complex.Rpart * Complex.Rpart + Complex.Impart * Complex.Impart), (imPart * Complex.Rpart -rPart * Complex.Impart) / (Complex.Rpart * Complex.Rpart + Complex.Impart * Complex.Impart)  )  ;
        }

        public override string ToString()
        {
            return rPart + " " + getSign(imPart) + " " + Math.Abs(imPart) + "i";
        }

        
    }
}
