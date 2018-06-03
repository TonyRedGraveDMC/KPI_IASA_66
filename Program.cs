using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Text.RegularExpressions;

namespace Kyrsach2018
{
    public class Program
    {

        static void Main(string[] args)
        {
            //string iN = "3324 - 3414i";
            //Console.WriteLine(iN);

            //iN = iN.Replace("i", "");
            //Console.WriteLine(iN);

            //string pattern = @"\+|\-";
            //string[] tokens = Regex.Split(iN, pattern);
            //string sign = Regex.Match(iN, pattern).Value;
            //double rPart = Convert.ToDouble(tokens[0]);
            //double imPart = Convert.ToDouble(tokens[1]);
            //Console.WriteLine(rPart + sign + imPart + "i");


            //Cnumber c1 = new Cnumber(2,-3);
            //Cnumber c2 = new Cnumber(0,1);
            //Cnumber c3 = c1.Add(c2);
            //Console.WriteLine(c3);
            //Cnumber c4 = c1.Minus(c2);
            //Console.WriteLine(c4);
            //Cnumber c5 = c1.Multiply(c2);
            //Console.WriteLine(c5);
            //Cnumber c6 = c1.Division(c2);
            //Console.WriteLine(c6);

            Rnumber r1 = new Rnumber(320);
            Rnumber r2 = new Rnumber();
            Rnumber r3 = r1.Add(r2);
            Rnumber r4 = r1.Minus(r2);
            Rnumber r5 = r1.Multiply(r2);
            Rnumber r6 = r1.Division(r2);


            Console.WriteLine(r3);
            Console.WriteLine(r4);
            Console.WriteLine(r5);
            Console.WriteLine(r6);



        }
    }

}