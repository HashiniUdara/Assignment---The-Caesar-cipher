object ceasar{
	def main(args:Array[String]){}

	val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"

	val Encrypt=(c:Char,key:Int,a:String)=>a( (a.indexOf(c.toUpper)+key)%a.size )
	val Decrypt=(c:Char,key:Int,a:String)=>a( (a.indexOf(c.toUpper)-key)%a.size )

	val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))

	val x=cipher(Encrypt,"ceasar",5,alphabet)
	val y=cipher(Decrypt,x,5,alphabet)

	println("cipher => "+x)
	println("original => "+y)
}
