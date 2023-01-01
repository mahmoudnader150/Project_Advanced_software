# Project_Advanced_software
i) How to build the project in eclipse EE:
    Import project as "Existing Maven Project"
    then Select the "FawrySystemApplication.JAVA" class and right click then Run As "Java Application"
ii) The project depends on Java 11
iii) Examples for using the API correctecly: 
Note: the data type of variable "amount" and "totalCost" is double

1- To sign-up a new account as a customer:
   With "POST" method type in the URL: http://localhost:8080/customer/signup
   and type in the JSON file: "Customer object" 
   {
    "userName" : "ziad",
    "email" : "z@1",
    "password" : "123",
    "phone" : "1234"
    }
    The JSON response:
    "Successfully sign up" or "This account already exists"
  
2- To login as a customer:
  With "POST" method type in the URL: http://localhost:8080/customer/signin
  and type in the JSON file: 
  {
    "userName" : "ziad",
    "email" : "z@1",
    "password" : "123",
    "phone" : "1234"
  }
  There is no account existing in the code...you must sign-up first then login
  The JSON response:
  "Successfully login" or "Login failed"
  
3- To get the total cost of some service after the fees and applying the discounts:
  With "GET" method type in the URL: http://localhost:8080/service/{userName}/getcost
  and in our example here http://localhost:8080/service/ziad/getcost
  and type in th JSON file: "Service Provdier object"
  {
    "serviceProvider" : "vodafonecash",
    "serviceName" : "landline",
    "amount" : 90.5,
    "phone" : "0101010"
  }
  The JSON response:
  "Total cost: " + total cost. 
  Note: the total cost will change if you get the total cost of some service twice because the first one will apply the overall discount which is the "first time"       discount
  
4- To pay for some service after getting the JSON response for the total cost
  With "GET" method type in the URL: http://localhost:8080/service/{userName}/pay/{paymentMethod}/{totalcost}
  paymet method like: "creditcardpayment", "cashpayment", "walletpayment"
  and for our examle: http://localhost:8080/service/ziad/pay/creditcardpayment/60.5
  The JSON response:
  totalcost + "Paid with " + paymentMethod
  for example: "60.5 Paid with credit card"
  
5- To make refund request as a customer:
  With "GET" method type in the URL: http://localhost:8080/refund/{userName}/makerefund
  and in our example here http://localhost:8080/service/ziad/getcost
  and type in th JSON file: "Hash map" object to take the data
  {
    "transactionName" : "laneline",
    "amount": 90.4
  }
  The JSON response:
  "Refund request is sent to the admin"
  
6- To check refund request as a customer: 
  With "GET" method type in the URL: http://localhost:8080/refund/{userName}/checkrefund
  and for our examle: http://localhost:8080/refund/ziad/checkrefund
  The JSON response:
  "No refund request found" or "Accepted" or "Denied"
  
7- To get the wallet details as a customer: 
  With "GET" method type in the URL: http://localhost:8080/wallet/{userName}/getdetails
  and for our example http://localhost:8080/wallet/ziad/getdetails
  The JSON response:
  "Wallet amount is: "+ amount
  for example: "Wallet amount is: 50.0"
  
8- To add amount in your wallet as a customer:
  With "PUT" method type in the URL http://localhost:8080/wallet/{userName}/addamount/{amount}      "This variable amount is double data type"
  and for our example http://localhost:8080/wallet/ziad/addamount/90.5
  The JSON response:
  "Added Successfully"
  
9- To login as an "Admin": 
  With "POST" method type in the URL: http://localhost:8080/admin/signin
  and type in the JSON file: "Admin object" 
  {
    "userName" : "hassan",
    "password" : "0000",
    "email": "h@3"
  }
  This is an existing object in the code.
  The JSON response: 
  "Succefully login" or "Login Failed"
  
10- To list all payment transactions as an "Admin":
  With "GET" method type in the URL: http://localhost:8080/admin/getPaymentTransactions
  The JSON response: 
  Array of PaymentTransaction objects
  
11- To list all refund requests:
  With "GET" method type in the URL: http://localhost:8080/admin/getRefundRequests
  The JSON response: 
  Array of RefundRequest objects
  
12- To list all wallet transactions:
  With "GET" method type in the URL: http://localhost:8080/admin/getWalletTrancations
  The JSON response: 
  Array of WalletTransaction objects
  
13- To reply for some refund request:
  With "PUT" method type in the URL: http://localhost:8080/admin/{userName}/requestreply  
  and for our example: http://localhost:8080/admin/ziad/requestreply
  The JSON response:
  "Refund request accepted" or "No refund request with this name"
  
