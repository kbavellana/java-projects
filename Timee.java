public class Timee
{ 	private int hour;
	private int minute;
	private int second;
	
	
	public void oras(int h, int m, int s)
	{
		hour = ((h>0 && h<24 ) ? h : 0);
		minute = ((m>0 && m<60 ) ? m : minuto(m));
		second = ((s>0 && s<60 ) ? s : segundo(s));
		
	}
	
	public String militaryTime()
	{
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	public int minuto(int m)
	{
		h+= m/60;
		m = m%60;
	}
	public int segundo(int s)
	{
		m+= s/60;
		s = s%60;
	}
}
