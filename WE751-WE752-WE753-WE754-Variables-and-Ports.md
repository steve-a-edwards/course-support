## **Variables and Ports for DataPower Courses WE751, WE752, WE753, WE754** 

Replace **nn** in port values below with two-digit student number.

For students using the Skytap / IRLP remote labs, the value of **nn** will be **01** for all students.


|**DataPower Settings**|
| :- |
|DataPower WebGUI|https://192.168.0.100:9090||
|<dp\_internal\_ip>|192\.168.0.100||
|<p><dp\_public\_ip></p><p><dp\_external\_ip> \*</p>|192\.168.0.101|<p></p><p>\* this is really a typo on P5.25</p>|
|<studentnn> (user)|studentnn||
|<studentnn\_password>|studentnn|Changed on first login.|
|<studentnn\_domain>|studentnn\_domain||
|<dp\_admin\_login>|sysadmin||
|<dp\_admin\_password>|irlpsysadmin||
|<dp\_ssh\_port>|22||
|<dp\_WebGUI\_port>|9090||
|<dp\_xml\_mgmt\_port>|5550||
||||
||||
|**Ubuntu Linux Settings**||
|<lab\_files>|/usr/labfiles/dp||
|<image\_ip>|192\.168.0.1||
|<linux\_user>|localuser||
|<linux\_user\_password>|passw0rd||
||||
|**Ports used by course pre-built services to emulate backend services**||
|<FLY\_baggage\_port>|2068|Also shown in notes with 'dp' prefix.|
|<FLY\_booking\_port>|9080|Also shown in notes with 'dp' prefix.|
||	||
||vvv - PTO for student allocated ports - vvv||
|**Allocated ports for student-built services**||
|<mpgw\_helloworld\_port>|12nn7||
|<mpgw\_booking\_port>|12nn1||
|<p><mpgw\_booking\_ssl\_port></p><p><mpgw\_proxy\_ssl\_port> \*\*</p>|<p>12nn2</p><p></p>|WE751 - Alternative name used 3 times on pages 5.24, 5.25.|
|<mpgw\_booking\_client> +|12nn3|+ Need to add to list in the SOAPUI *Preferences* / *Global Properties*|
|<p><wsp\_proxy\_port></p><p>**<wsp\_booking\_port>** \*</p><p></p>|12nn5|<p>WE754 - Alternative names used on pages 2.4, 2.7, 2.14, 2.18, 2.22.</p><p>\* Value used in SOAPUI request</p><p>**17 – WSP Crypto Request**</p>|
|<mpgw\_patterns\_port>|12nn8||
|<mpgw\_baggage\_port>|12nn9||
|<SignEncryptJOSE\_port>|13nn1||
|<VerifyDecryptJOSE\_port>|13nn3||
|<GWS\_XMLFW\_port>|13nn5||
|<oauth\_wts\_port>|7nn0||
|<oauth\_ep\_port>|7nn3||
|<oidc\_client\_port>|7nn4||
|<oidc\_provider\_port>|7nn5||



# Course Resources
This page and other course resources may be accessed via links in the file:

**datapower.md**

` `in the github project:

[**https://github.com/steve-a-edwards/course-support**](https://github.com/steve-a-edwards/course-support)

which is provided by Steve Edwards (<steve@escala.co.uk>)


This page is published on: <https://docs.google.com/document/d/e/2PACX-1vS5lZHs2tdYqQfV69FIBwk8be_IxIjSFe_7h_72iavp4TElK0f8QCEsmmosyn3Z5VYcOEAQ8QUT4XVD/pub>

