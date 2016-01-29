
var clock={
	
		temp: 0,			
		replacee:function(ele_id,htmlcontent){
				
				document.getElementById(ele_id).innerHTML=htmlcontent;
			},
		formatDate:     function(d){
				var date=d.getDate();

				var year=d.getFullYear();
				var hours=d.getHours();
				var minutes=d.getMinutes();
				var seconds=d.getSeconds();

				var month = new Array();
				month[0] = "January";
				month[1] = "February";
				month[2] = "March";
				month[3] = "April";
				month[4] = "May";
				month[5] = "June";
				month[6] = "July";
				month[7] = "August";
				month[8] = "September";
				month[9] = "October";
				month[10] = "November";
				month[11] = "December";
				var n = month[d.getMonth()];

				return (date+" "+n+", "+year+" "+hours+":"+minutes+":"+seconds);
			},
			getCurrentDate: function(){
			
				var d=new Date();
				return d;
			},
			updateTime: function()
					{
					var currentDate = clock.getCurrentDate();
					currentDate = clock.formatDate(currentDate)
					clock.replacee("timeDisp",currentDate);
		
				
					},
			stop: function()
				{

				clearInterval(temp);
				}
		};

		var currentDate = clock.getCurrentDate();
		currentDate = clock.formatDate(currentDate)
		clock.replacee("timeDisp",currentDate);
		temp=setInterval(clock.updateTime,1000);
		

