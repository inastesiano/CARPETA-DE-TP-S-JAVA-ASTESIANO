
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FuncionesPrograma {
    public static String getFechaString(Date fecha){
        SimpleDateFormat fechaa= new SimpleDateFormat("dd/MM/yyyy");
        String fechaCadena= fechaa.format(fecha);
        return fechaCadena;
    }
    public static Date getFechaDate(int dia, int mes, int anio){
        Calendar calendario = new GregorianCalendar();
        calendario.set(Calendar.DAY_OF_MONTH, dia);
        calendario.set(Calendar.MONTH, mes - 1);
        calendario.set(Calendar.YEAR, anio);
        return calendario.getTime();
    }
    public static void main(String[] args){
        Date date=new Date();
        String cadena=getFechaString(date);
        Date cal = getFechaDate(2,9,2024);
        System.out.println("la fecha como cadena es "+cadena);
        System.out.println("la fecha como date es "+ date);
        System.out.println("la fecha en date es "+cal);
    }
}
