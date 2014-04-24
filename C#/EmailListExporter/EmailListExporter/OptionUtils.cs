using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EmailListExporter
{
    class OptionUtils
    {

        private OptionUtils()
        { }

        public static List<List<String>> parseOptionsAsStringFromList(String fileName, int numOptions)
        {
            List<List<String>> optionsAsStringList = new List<List<String>>();

            using (StreamReader br = new StreamReader(fileName))
            {
                String options;
                while ((options = br.ReadLine()) != null)
                {
                    List<String> optionList = options.Split(',').ToList();
                    int numberOfOptionsInList = optionList.Count;
                    if (numberOfOptionsInList == numOptions)
                    { optionsAsStringList.Add(optionList); }


                }
            }
            if (optionsAsStringList.Count == 0)
            {
                throw new System.ArgumentNullException();
            }

            return optionsAsStringList;
        }


    }
}
