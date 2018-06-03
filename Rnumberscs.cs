using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace Kyrsach2018
{
    class Rnumber : AbstractNumber<Rnumber>
    {
        public Rnumber()
        {
            this.Num = 1;
        }
        public Rnumber(double num)
        {
            this.Num = num;
        }

        public override Rnumber Add(Rnumber number)
        {
            return new Rnumber(Num + number.Num);
        }

        public override Rnumber Minus(Rnumber realnumber)
        {
            return new Rnumber(Num - realnumber.Num);
        }

        public override Rnumber Multiply(Rnumber number)
        {
            return new Rnumber(Num * number.Num);
        }

        public override Rnumber Division(Rnumber number)
        {
            if (number.Num == 0)
            {
                Console.WriteLine("division by 0");
                return null;
            }
            else
                return new Rnumber(Num / number.Num);
        }
    }
}
