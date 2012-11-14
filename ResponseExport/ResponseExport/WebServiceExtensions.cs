using System;
using Checkbox.Wcf.Services.Proxies;

namespace ResponseExport
{
    static class WebServiceExtensions
    {
        public static T GetResults<T>(this ServiceOperationResult<T> result)
        {
            if(!result.CallSuccess)
                throw new Exception(result.FailureMessage);

            return result.ResultData;
        }
    }
}
