<html>
</head>
<body>
	<script>
  window.fbAsyncInit = function() 
  {
    FB.init
    (
    {
      appId      : '1686330418354709',
      xfbml      : true,
      version    : 'v2.8'
    }
    );
    FB.AppEvents.logPageView();

    FB.getLoginStatus(function(response) 
    {
      if (response.status === 'connected') 
      {
  	   //document.getElementById('status').innerHTML='.We are connected.';
  	   var uid = response.authResponse.userID;
        var accessToken = response.authResponse.accessToken;
        
      } 
      else if (response.status === 'not_authorized') 
      {
  	   document.getElementById('status').innerHTML='.We are not logged in2.'; 
      }  
      else 
      {
  	   document.getElementById('status').innerHTML='.not2.';
           login();
      }
    });
  };
  
  (function(d, s, id)
  {
     var js, fjs = d.getElementsByTagName(s)[0];
     if (d.getElementById(id)) {return;}
     js = d.createElement(s); js.id = id;
     js.src = "//connect.facebook.net/en_US/sdk.js";
     fjs.parentNode.insertBefore(js, fjs);
   }
   (document, 'script', 'facebook-jssdk'));

function login()
{
FB.login(function(response)
{
	if (response.status === 'connected') 
  {
  	document.getElementById('status').innerHTML='.We are connected1.';
        info();
  } 
  else if (response.status === 'not_authorized') 
  {
  	document.getElementById('status').innerHTML='.We are not logged in1.'; 
  }
  else 
  {
  	document.getElementById('status').innerHTML='.not1.';
  }
});
}

function logout()
{
FB.logout(function(response) {});
}

function info()
{
//document.getElementById('status').innerHTML='.aa gaya.'; 
//email is extended permission
FB.login(function(response) 
{
  console.log((response));
}, {scope: 'email,user_likes,user_friends,user_actions.music'});

  //running
  //name aur id default 
  FB.api('/me', 'GET', {fields: 'first_name,last_name,name,id,email,friends,music'}, function(response) 
  {
      var i=0,j=0;
      var music="";
      var s="";
      var friend="";
        console.log((response));
       /* window.location = "http://localhost:8080/WebApplication1/database.jsp?response=" + encodeURIComponent(response.name);*/
        document.formname.name.value = response.name;
        document.formname.id.value = response.id;
        document.formname.email.value = response.email;
        while((response.music.data.length)!==i)
        {
            s = response.music.data[i].name;
            if(s.indexOf(/'/g))
            {
                s=s.replace(/'/g, "\\'");
                music = music + s + ",";
                i++;
            }
            else
            {
                music = music + response.music.data[i].name + ",";
                i++;
            }
        }
           document.formname.music.value = music;
        
        while((response.friends.data.length)!==j)
        {
            friend = friend + response.friends.data[j].id + " ";
            j++;
        }
        document.formname.friend.value = friend;
        document.formname.music_count.value = response.music.data.length;
        document.formname.friend_count.value = response.friends.data.length;

        document.formname.submit();
  });
}
</script>

        <form name="formname" action="database.jsp" method="post">
            <input type="hidden" name="name">
            <input type="hidden" name="music">
            <input type="hidden" name="id">
            <input type="hidden" name="email">
            <input type="hidden" name="friend">
            <input type="hidden" name="music_count">
            <input type="hidden" name="friend_count">
        </form>

<div id="status"></div>

</body>
</html>