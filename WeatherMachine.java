// WeatherMachine.java

public class WeatherMachine
{
    private Thermometer thermometer;

    public WeatherMachine(Thermometer thermometer)
    {
        this.thermometer = thermometer;
    }

    private int[] getPastTemperatures()
    {
        int[] tempArray = new int[24];
        for(int x = 0; x < 24; x++)
        {
            tempArray[x] = thermometer.getTemperature();
        }
        return tempArray;
    }

    public void getWeatherReport()
    {
        int[] weatherTemperatures = getPastTemperatures();
        for(int x = 0; x < 24; x++)
        {
            System.out.println(x + ":00 - " + weatherTemperatures[x] + " degrees");
        }
    }
}