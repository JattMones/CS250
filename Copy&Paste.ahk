^!c::
Text1 = %Clipboard%
Sleep, 100
Send, ^c
Sleep, 100
Text2 = %Clipboard%
Sleep, 100
Clipboard = %Text1%
return
^!v::
Send, %Text2%
return
