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
            throw new NotImplementedException();
        }

        public override Hnumber Division(Hnumber t)
        {
            throw new NotImplementedException();
        }

        public override Hnumber Minus(Hnumber t)
        {
            throw new NotImplementedException();
        }

        public override Hnumber Multiply(Hnumber t)
        {
            throw new NotImplementedException();
        }
    }
}
