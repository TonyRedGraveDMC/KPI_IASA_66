using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Kyrsach2018
{
    class Hnumber:AbstractNumber<Hnumber>
    {
        private double rPart, iPart, jPart, kPart;

        public Hnumber()
        {
            rPart = 1; iPart = 1; jPart = 1; kPart = 1;
        }

        public Hnumber(double rPart, double iPart, double jPart, double kPart)
        {
            this.rPart = rPart;
            this.iPart = iPart;
            this.jPart = jPart;
            this.kPart = kPart;
        }

        public double Ipart
        {
            get
            {
                return iPart;
            }

            set
            {
                iPart = value;
            }
        }

        public double Jpart
        {
            get
            {
                return jPart;
            }

            set
            {
                jPart = value;
            }
        }

        public double Kpart
        {
            get
            {
                return kPart;
            }

            set
            {
                kPart = value;
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

        

        // (sqrt(a^2 +b^2 +c^2 +d^2))^2 "norma"
        private double Norm(Hnumber Quater)
        {
            return (Quater.Rpart * Quater.Rpart + Quater.Ipart * Quater.Ipart
                  + Quater.Jpart * Quater.Jpart + Quater.Kpart * Quater.Kpart);
        }

        public override Hnumber Add(Hnumber Quater)
        {
            return new Hnumber(rPart + Quater.Rpart, iPart + Quater.Ipart, jPart + Quater.Jpart, kPart + Quater.Kpart);
        }

        public override Hnumber Minus(Hnumber Quater)
        {
            return new Hnumber(rPart - Quater.Rpart, iPart - Quater.Ipart, jPart - Quater.Jpart, kPart - Quater.Kpart);
        }

       
        //   ( a + bi +cj +dk) * (a' + b'i + c'j +d'k) = 1(aa' - bb' - cc' - dd') +
        //                                             + i(ab' + a'b + cd' - c'd) +
        //                                             + j(ac' + a'c - bd' + b'd) +
        //                                             + k(ad' + a'd + bc' - b'c).
        public override Hnumber Multiply(Hnumber Quater)
        {
            return new Hnumber
                (rPart * Quater.Rpart - iPart * Quater.Ipart - jPart * Quater.Jpart - kPart * Quater.Kpart,
                 rPart * Quater.Ipart + Quater.Rpart * iPart + jPart * Quater.Kpart - Quater.Jpart * kPart,
                 rPart * Quater.Jpart + Quater.Rpart * jPart - iPart * Quater.Kpart + Quater.Ipart * kPart,
                 rPart * Quater.Kpart + Quater.Rpart * kPart + iPart * Quater.Jpart - Quater.Ipart * jPart);
        }

        private Hnumber Reverse(Hnumber Quater)
        {
            return new Hnumber(-Quater.Rpart, -Quater.Ipart, -Quater.Jpart, -Quater.Kpart);
        }

        public override Hnumber Division(Hnumber Quater)
        {
            //  this.Reverse(Quater);
            Console.WriteLine("Norm = " + Norm(Quater));
            if ((Quater.Rpart + Quater.Ipart + Quater.Jpart + Quater.Kpart) == 0)
            {
                Console.WriteLine("division by 0");
                return null;
            }
            else
            {
               
                return new Hnumber
                 (rPart * Quater.Rpart / Norm(Quater) + iPart * Quater.Ipart / Norm(Quater) + jPart * Quater.Jpart / Norm(Quater) + kPart * Quater.Kpart / Norm(Quater),
                 -rPart * Quater.Ipart / Norm(Quater) + Quater.Rpart / Norm(Quater) * iPart - jPart * Quater.Kpart / Norm(Quater) + Quater.Jpart / Norm(Quater) * kPart,
                 -rPart * Quater.Jpart / Norm(Quater) + Quater.Rpart / Norm(Quater) * jPart + iPart * Quater.Kpart / Norm(Quater) - Quater.Ipart / Norm(Quater) * kPart,
                 -rPart * Quater.Kpart / Norm(Quater) + Quater.Rpart / Norm(Quater) * kPart - iPart * Quater.Jpart / Norm(Quater) + Quater.Ipart / Norm(Quater) * jPart);
            }
            
        }

        new public string getSign(double Num)
        {
            return Math.Sign(Num) == 1 ? "+" : "-";
        }

        public override string ToString()
        {
            return rPart + " " + getSign(iPart) + " " + Math.Abs(iPart)  + "i" + " " + getSign(jPart) + " " + Math.Abs(jPart)  + "j" + " " + getSign(kPart) + " " + Math.Abs(kPart) + "k";
        }

    }
}
