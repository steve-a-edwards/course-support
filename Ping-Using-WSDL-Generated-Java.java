/*
Example of Java driving XMI / SOMA using classes generated from WSDL, XSD files
(store://xml-mgmt.*) that define the SOMA WebService.
In this case, the JDK1.6 utility wsimport was used. The code in bold below is
using the generated classes.

Other WebService toolkits have similar generation capabilities.
*/

import client.soma.coded.utility.SOMAPortProvider;
import client.soma.generated.ActionPing;
import client.soma.generated.AnyActionElement;
import client.soma.generated.Request;
import client.soma.generated.Response;
import client.soma.generated.Response.Result;
import client.soma.generated.XmlMgmt;

// The following code would need to be placed inside an enclosing program

String hostToPing = "192.168.1.102";

// The following line takes care of XMI username, password, endpoint, certs
// This is regular WebServices, BasicAuth and SSL coding
SOMAPortProvider portProvider = new SOMAPortProvider();

XmlMgmt port = portProvider.getPort();

// Build up request:
Request request = new Request();
ActionPing actionPing = new ActionPing();
actionPing.setRemoteHost(hostToPing);
AnyActionElement anyActionElement = new AnyActionElement();
anyActionElement.getAddKnownHostOrAddPasswordMapOrAddSelTestEntry().add(actionPing);

request.setDoAction(anyActionElement);

Response response = port.operation(request);
Result result = response.getResult();

if (result != null) System.out.println("Result content: " +  (result.getContent()).toArray()[0]);

// OK if successful ping
// [error-log: null] if not

/*
See below for example of SOAP envelopes involved in request and response.

Request:

<S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/">
  <S:Body>
    <ns2:request xmlns:ns2="http://www.datapower.com/schemas/management">
      <ns2:do-action>
        <Ping>
          <RemoteHost>192.168.1.102</RemoteHost>
        </Ping>
      </ns2:do-action>
    </ns2:request>
  </S:Body>
</S:Envelope>

Response (if success):
	
<env:Envelope xmlns:env="http://schemas.xmlsoap.org/soap/envelope/">
  <env:Body>
    <dp:response xmlns:dp="http://www.datapower.com/schemas/management">
      <dp:timestamp>2014-11-15T23:09:50-05:00</dp:timestamp>
      <dp:result>OK</dp:result>
    </dp:response>
  </env:Body>
</env:Envelope>


Response (if fail to connect to host):

<env:Envelope xmlns:env="http://schemas.xmlsoap.org/soap/envelope/">
  <env:Body>
    <dp:response xmlns:dp="http://www.datapower.com/schemas/management">
      <dp:timestamp>2014-11-15T23:08:27-05:00</dp:timestamp>
      <dp:result>
        <error-log>
          <log-event level="error">Host unreachable: '192.168.1.202'</log-event>
        </error-log>
      </dp:result>
    </dp:response>
  </env:Body>
</env:Envelope>
*/

