      NAME                                                      TYPE          VALUE  
    var://service/aaa-error-logs                               node-set      (show nodeset)  
    var://service/b2b-proxy/b2b-message-id                     string        (empty string)  
    var://service/b2b-proxy/b2b-partner-from                   string        (empty string)  
    var://service/b2b-proxy/b2b-partner-to                     string        (empty string)  
    var://service/b2b-proxy/integration-id                     string        (empty string)  
    var://service/b2b-proxy/is-mdn                             string        (empty string)  
    var://service/b2b-proxy/message-decrypted                  string        (empty string)  
    var://service/b2b-proxy/message-encrypt-required           string        (empty string)  
    var://service/b2b-proxy/message-sign-required              string        (empty string)  
    var://service/b2b-proxy/message-signature-verified         string        (empty string)  
    var://service/b2b-proxy/passthru-enabled                   string        (empty string)  
    var://service/cache/dynamic-policies                       node-set      (show nodeset)  
    var://service/client-service-address                       string        '172.17.0.1:53256'  
    var://service/conformance/policyname                       string        (empty string)  
    var://service/connection/note                              string        (empty string)  
    var://service/current-call-depth                           string        '0'  
    var://service/default-stylesheet                           string        'store:///identity.xsl'  
    var://service/domain-name                                  string        'FLYServices'  
    var://service/error-code                                   string        '0x00000000'  
    var://service/error-headers                                string        (empty string)  
    var://service/error-ignore                                 string        '0'  
    var://service/error-message                                string        (empty string)  
    var://service/error-subcode                                string        '0x00000000'  
    var://service/formatted-error-message                      string        (empty string)  
    var://service/gatewayscript/debug-enabled                  string        '0'  
    var://service/gatewayscript/enable-eval                    string        '0'  
    var://service/global-transaction-id                        string        '102913'  
    var://service/header-manifest                              node-set      (show nodeset)  
    var://service/http/websocket-upgrade                       string        '0'  
    var://service/input-size                                   string        '200'  
    var://service/lb/group                                     string        (empty string)  
    var://service/lb/member                                    string        (empty string)  
    var://service/local-service-address                        string        '172.17.0.2:9080' 
    var://service/max-action-depth                             string        '128'  
    var://service/max-call-depth                               string        '128'  
    var://service/memory-used                                  string        '5176392'  
    var://service/mpgw/backend-config                          node-set      (show nodeset)  
    var://service/mpgw/backend-timeout                         string        '120'  
    var://service/mpgw/request-size                            string        '200'  
    var://service/mpgw/response-size                           string        '0'  
    var://service/mpgw/skip-backside                           string        '0'  
    var://service/mpgw/transaction-timeout-ms-count            string        '3'  
    var://service/mpgw/transaction-timeout-ms-threshold        string        '0'  
    var://service/multistep/contexts                           node-set      (show nodeset)  
    var://service/multistep/input-context-name                 string        'INPUT'  
    var://service/multistep/loop-count                         string        (empty string)  
    var://service/multistep/loop-iterator                      string        (empty string)  
    var://service/multistep/output-context-name                string        'dpvar_10'  
    var://service/multistep/tx-warn                            string        (empty string)  
    var://service/original-content-type                        string        'application/x-www-form-urlencoded'  
    var://service/original-response-content-type               string        (empty string)  
    var://service/persistent-connection-counter                string        '1'  
    var://service/preserve-mime-encapsulation                  string        '0'  
    var://service/processor-name                               string        'BookingServiceBackend'  
    var://service/processor-type                               string        'Multiprotocol Gateway'  
    var://service/protocol                                     string        'http'  
    var://service/protocol-method                              string        'POST '  
    var://service/qos/priority                                 string        'normal'  
    var://service/rewrite-errors                               string        '-1'  
    var://service/routing-url                                  string        'http://172.17.0.2:9080/V2'    
    var://service/routing-url-sslprofile                       string        (empty string)  
    var://service/soap-fault-response                          string        '0'  
    var://service/strict-error-mode                            string        'false'  
    var://service/system/ident                                 node-set      (show nodeset)  
    var://service/time-elapsed                                 string        '2'  
    var://service/time-forwarded                               string        '0'  
    var://service/time-response-complete                       string        '0'  
    var://service/time-started                                 string        '1'  
    var://service/transaction-audit-trail                      node-set      (show nodeset)  
    var://service/transaction-client                           string        '172.17.0.1'  
    var://service/transaction-id                               string        '102913'  
    var://service/transaction-policy-name                      string        'BookingServiceBackendPolicy'  
    var://service/transaction-rule-name                        string        'BookingServiceBackendPolicy_rule_1'  
    var://service/transaction-rule-type                        string        'request'  
    var://service/URI                                          string        '/V2'  
    var://service/URL-in                                       string        'http://172.17.0.2:9080/V2'  
    var://service/URL-out                                      string        'http://172.17.0.2:9080/V2'  
    var://service/wsa/genpattern                               string        'sync'  
    var://service/wsa/timeout                                  string        '120'  
    var://service/wsm/http-parsed-url-replacement              node-set      (show nodeset)  
    var://service/wsm/user-data                                node-set      (show nodeset)  
    var://service/wspolicy/endpoint/configname                 string        (empty string)  
    var://service/wspolicy/message/configname                  string        (empty string)  
    var://service/wspolicy/operation/configname                string        (empty string)  
    var://service/wspolicy/service/configname                  string        (empty string)  
    var://service/xmlmgr-name                                  string        'BookingServiceBackend_XMLM'
----   

The node-set **var://service/system/ident**

    <identification
        xmlns:dp="http://www.datapower.com/schemas/management"
        xmlns:env="http://schemas.xmlsoap.org/soap/envelope/"
        build="292124"
        timestamp="Wed Jan 24 01:54:55 2018 ">
       <product-id>software</product-id>
       <product>IDG</product>
       <display-product>IDG</display-product>
       <model>IBM DataPower Gateway</model>
       <display-model>IBM DataPower Gateway</display-model>
       <device-name>docker-we75x</device-name>
       <serial-number>0000001</serial-number>
       <firmware-version>IDG.7.5.2.10</firmware-version>
       <display-firmware-version>IDG.7.5.2.10</display-firmware-version>
       <firmware-build>292124</firmware-build>
       <firmware-timestamp>2017/09/29 09:45:17</firmware-timestamp>
       <current-date>2018-01-24</current-date>
       <current-time>01:54:55 EST</current-time>
       <reset-date>2018-01-23</reset-date>
       <reset-time>19:34:21 EST</reset-time>
       <login-message />
       <custom-ui-file />
    </identification>
