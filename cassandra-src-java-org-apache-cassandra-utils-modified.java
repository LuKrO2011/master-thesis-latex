






private 
     static 
void 
    debug( Process 
    v1 
    )       throws IOException
{
// Doo debug
    try (BufferedReader   b 
= new 
        BufferedReader(
            new InputStreamReader(
                v1.getInputStream()
                )
                )
                )
                {
    StrBuilder b2=new StrBuilder();String v2;while (null!=(v2=input.readLine())){b2.appendln(v2);} // Doo stuff
    m.info(  builder.toString()
);
}
 }