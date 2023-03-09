// Extract 'from_date' from incoming JSON and create a SOAP message.
// Author: Steve Edwards, Escala Ltd.
// Date  : 2015-04-14.
// Note  : this code is for demonstration purposes only, not production - level.
// This overall file is Gateway Script.
// Build your own Multi-Protocol Gateway, with a request rule that matches the URI /json-gwscript-to_soap
// this having an HTTP Handler with a port you choose.
// The request rule processing the JSON message shown below, would have a Gateway Script action
// followed by an action that sets a system variable that "skips backside" processing to give a
// loop back service (no backend is called).
// Sample URL: http://dp-ip:port/json-gwscript-to_soap
// with content of form: {"from_date": {"day": 20, "month": 1, "year": 2015}}
// e.g. curl http://192.168.1.70:8090/json-gwscript-to_soap -d '{"from_date": {"day": 20, "month": 1, "year": 2015}}'

// Read the input as a JSON object (from input context variable to this action)

session.input.readAsJSON (function (error, json) {
    if (error) {
      // an error occurred when parsing the content, e.g. invalid JSON object
      // uncatched error will stop the processing and the error will be logged
      throw error;
    }
        var from_date = json.from_date;
        var full_date_string = from_date.year + "-" + from_date.month + "-" + from_date.day;
        console.alert("Request full_date_string: " + full_date_string);
        var soap_request =            "<S:Envelope xmlns:S=\"http://schemas.xmlsoap.org/soap/envelope/\">"
                                        +     "<S:Body>"
                                        +         "<ns2:daysToChristmas xmlns:ns2=\"http://service.days/\">"
                                        +             "<arg0>" + full_date_string + "</arg0>"
                                        +         "</ns2:daysToChristmas>"
                                        +     "</S:Body>"
                                        +  "</S:Envelope>";
        session.output.write(soap_request);
});

/*
Creates output of form:
<S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/">
        <S:Body>
                <ns2:daysToChristmas xmlns:ns2="http://service.days/">
                        <arg0>2015-1-20</arg0>
                </ns2:daysToChristmas>
        </S:Body>
</S:Envelope>
*/
