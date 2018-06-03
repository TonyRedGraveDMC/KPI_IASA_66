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

        public override Hnumber Add(Hnumber Quater)
        {
            return new Hnumber(rPart + Quater.Rpart, iPart + Quater.Ipart, jPart + Quater.Jpart, kPart + Quater.Jpart);
        }

        public override Hnumber Minus(Hnumber Quater)
        {
            return new Hnumber(rPart - Quater.Rpart, iPart - Quater.Ipart, jPart - Quater.Jpart, kPart - Quater.Jpart);
        }

       

        public override Hnumber Multiply(Hnumber t)
        {
            throw new NotImplementedException();
        }

        public override Hnumber Division(Hnumber t)
        {
            throw new NotImplementedException();
        }

        new public string getSign(double Num)
        {
            return Math.Sign(Num) == 1 ? "+" : "-";
        }

        public override string ToString()
        {
            return rPart + getSign(iPart) + Math.Abs(iPart) + "i" + getSign(jPart) + Math.Abs(jPart) + "j" + getSign(kPart) + Math.Abs(kPart) + "k";
        }

    }
}
