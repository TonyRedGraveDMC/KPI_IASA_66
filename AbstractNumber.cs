using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Kyrsach2018
{
    public abstract class AbstractNumber<T>
    {
        private double num;

        public double Num
        {
            get
            {
                return num;
            }

            set
            {
                num = value;
            }
        }

        public abstract T Add(T t);
        public abstract T Minus(T t);
        public abstract T Multiply(T t);
        public abstract T Division(T t);

        public string getSign(double Num)
        {
            return Math.Sign(Num) == 1 ? "+" : "-";
        }
        public override string ToString()
        {
            return num.ToString();
        }
    }
}
