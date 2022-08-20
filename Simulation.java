public class Simulation
{
    public static void main(String[] args)
    {
        WeatherMachine weatherMachine = new WeatherMachine(new Thermometer());
        weatherMachine.getWeatherReport();
    }
}