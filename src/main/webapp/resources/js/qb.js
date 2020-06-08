function searchTimeInterval(days){
	var timeObj=new Object();
	var now=new Date();
	timeObj['startTime']='';
	timeObj['endTime']='';
	/*if(days=='0'){
		
	}else */
	if(days=='1h'){
		var searchTime=now.getTime()-3600000;
		var ago=new Date(searchTime);
		var startDate=ago.getFullYear()+"-"+(ago.getMonth()+1)+"-"+ago.getDate()+" "+ago.getHours()+":"+ago.getMinutes()+":"+ago.getSeconds();
		var endDate=now.getFullYear()+"-"+(now.getMonth()+1)+"-"+now.getDate()+" "+now.getHours()+":"+now.getMinutes()+":"+now.getSeconds();
		timeObj['startTime']=startDate;
		timeObj['endTime']=endDate;
	}else if(days=='1'|days=='7'|days=='30'){
		var searchTime=now.getTime()-(days*86400000);
		var ago=new Date(searchTime);
		var startDate=ago.getFullYear()+"-"+(ago.getMonth()+1)+"-"+ago.getDate()+" "+ago.getHours()+":"+ago.getMinutes()+":"+ago.getSeconds();
		var endDate=now.getFullYear()+"-"+(now.getMonth()+1)+"-"+now.getDate()+" "+now.getHours()+":"+now.getMinutes()+":"+now.getSeconds();
		timeObj['startTime']=startDate;
		timeObj['endTime']=endDate;
	}
	return timeObj;
}