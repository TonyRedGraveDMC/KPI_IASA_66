using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using static Kyrsach2018.Program;

namespace Kyrsach2018
{
    class Cnumber : AbstractNumber<Cnumber>
    {
        private double rPart, imPart;

       
        public Cnumber(double rpart, double impart)
        {
            this.rPart = rpart;
            this.imPart = impart;
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

        public override Cnumber Add(Cnumber Complex)
        {
            return new Cnumber(rPart + Complex.Rpart, imPart + Complex.Impart);
        }

        public override Cnumber Division(Cnumber t)
        {
            throw new NotImplementedException();
        }

        public override Cnumber Minus(Cnumber t)
        {
            throw new NotImplementedException();
        }

        public override Cnumber Multiply(Cnumber t)
        {
            throw new NotImplementedException();
        }

       

    }
}
