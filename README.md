Problem Statement
====================
Client wants to consume a Weather Widget for Displaying Current Temperature for a Given City and a Date.
Client has multiple devices on which they want to show this widget. Some of these devices are 
1. Mobile
2. Tablet
3. Desktop
4. Web Applications
5. 3rd Party Integrations
Design a service that consumes a City Name and a Date as Input, and should be able to output a Temperature and a Unit.

=========================================


The above problem is implemented with resteasy framework 

example curl to get Temperature for a Given City and a Date

curl  -v -k -X GET -H'Accept: application/json' 'http://localhost:8080/rest_sample_resteasy/weather/forecast?city=delhi&date=2015-05-12'


