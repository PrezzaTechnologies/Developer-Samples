using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Web;

namespace ResponseExporter
{
    public class ExportOptions
    {
        public static readonly int NUMBER_OF_OPTIONS = 23;
        private Uri APIUrl;
        private string userName;
        private string password;
        private int surveyID;
        private int pageNumber;
        private int resultsPerPage;
        private string filterField;
        private string filterValue;
        private string sortField;
        private Boolean sortAscending;
        private int period;
        private DateTime dtStart;
        private DateTime dtEnd;
        private Boolean detailedResponseInfo;
        private Boolean detailedUserInfo;
        private Boolean includeOpenEndedResults;
        private Boolean includeAliases;
        private Boolean includeHiddenItems;
        private Boolean includeIncompleteResponses;
        private Boolean stripHTMLTagsFromAnswers;
        private Boolean stripHTMLTagsFromQuestions;
        private Boolean mergeAnswersForSelectMany;
        private String csvFileName;

        public ExportOptions (List<String> optinonsLine)
        { 

            APIUrl = new Uri(optinonsLine[0]);
            userName = optinonsLine[1];
            password = optinonsLine[2];
            surveyID = Convert.ToInt32(optinonsLine[3]);
            pageNumber = Convert.ToInt32(optinonsLine[4]);
            resultsPerPage = Convert.ToInt32(optinonsLine[5]);
            filterField = optinonsLine[6];
            filterValue = optinonsLine[7];
           if (filterValue == "Yesterday")
            {
            
                filterValue = DateTime.Now.AddDays(-1).ToString("MM/dd/yyyy");
            }
            sortField = optinonsLine[8];
            sortAscending = Convert.ToBoolean(optinonsLine[9]);
            period = Convert.ToInt32(optinonsLine[10]);
            dtStart = Convert.ToDateTime(optinonsLine[11]);
            dtEnd = Convert.ToDateTime(optinonsLine[12]);
            detailedResponseInfo = Convert.ToBoolean(optinonsLine[13]);
            detailedUserInfo =  Convert.ToBoolean(optinonsLine[14]);
            includeOpenEndedResults = Convert.ToBoolean(optinonsLine[15]);
            includeAliases = Convert.ToBoolean(optinonsLine[16]);
            includeHiddenItems = Convert.ToBoolean(optinonsLine[17]);
            includeIncompleteResponses = Convert.ToBoolean(optinonsLine[18]);
            stripHTMLTagsFromAnswers =  Convert.ToBoolean(optinonsLine[19]);
            stripHTMLTagsFromQuestions = Convert.ToBoolean(optinonsLine[20]);
            mergeAnswersForSelectMany = Convert.ToBoolean(optinonsLine[21]);
            csvFileName = optinonsLine[22];
        }
        public Uri getAPIUrl()
        {
            return APIUrl;
        }

        public String getUserName()
        {
            return userName;
        }

        public String getPassword()
        {
            return password;
        }

        public int getSurveyId()
        {
            return surveyID;
        }

        public int getPageNumber()
        {
            return pageNumber;
        }

        public int getResultsPerPage()
        {
            return resultsPerPage;
        }

        public String getFilterField()
        {
            return filterField;
        }

        public String getFilterValue()
        {
            return filterValue;
        }

        public String getSortField()
        {
            return sortField;
        }

        public Boolean getSortAscending()
        {
            return sortAscending;
        }

        public int getPeriod()
        {
            return period;
        }

        public DateTime getDtStart()
        {
            return dtStart;
        }

        public DateTime getDtEnd()
        {
            return dtEnd;
        }

        public Boolean getDetailedResponseInfo()
        {
            return detailedResponseInfo;
        }

        public Boolean getDetailedUserInfo()
        {
            return detailedUserInfo;
        }

        public Boolean getIncludeOpenEndedResults()
        {
            return includeOpenEndedResults;
        }

        public Boolean getIncludeAliases()
        {
            return includeAliases;
        }

        public Boolean getIncludeHiddenItems()
        {
            return includeHiddenItems;
        }

        public Boolean getIncludeIncompleteResponses()
        {
            return includeIncompleteResponses;
        }

        public Boolean getStripHTMLTagsFromAnswers()
        {
            return stripHTMLTagsFromAnswers;
        }

        public Boolean getStripHTMLTagsFromQuestions()
        {
            return stripHTMLTagsFromQuestions;
        }

        public Boolean getMergeAnswersForSelectMany()
        {
            return mergeAnswersForSelectMany;
        }

        public String getCsvFileName()
        {
            return csvFileName;
        }
    }
}