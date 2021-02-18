coupon_rates= {
    "Monday" : "0.0%",
    "Tuesday" : "0.0%",
    "Wednesday" : "0.0%",
    "Thursday" : "0.0%",
    "Friday" : "0.0%",
    "Saturday" : "0.0%",
    "Sunday" : "0.0%"
}

coupon_rates["Monday"]= input("Enter coupon rates for Monday ")
coupon_rates["Tuesday"]= input("Enter coupon rates for Tuesday ")
coupon_rates["Wednesday"]= input("Enter coupon rates for Wednesday ")
coupon_rates["Thursday"]= input("Enter coupon rates for Thursday ")
coupon_rates["Friday"]= input("Enter coupon rates for Friday ")
coupon_rates["Saturday"]= input("Enter coupon rates for Saturday ")
coupon_rates["Sunday"]= input("Enter coupon rates for Sunday ")

i=0
while i<2:
    day=input("Enter day: ")
    print(f"The coupon rate for {day} is {coupon_rates[day]}")
    i+=1