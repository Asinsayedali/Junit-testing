public class Lasagna {
    
    // The expected cooking time in the oven
    public int expectedMinutesInOven(){
        return 40;
    }
    
    // Calculate remaining minutes in the oven
    public int remainingMinutesInOven(int minutesInOven){
        return expectedMinutesInOven() - minutesInOven;
    }
    
    // Preparation time is 2 minutes per layer
    public int preparationTimeInMinutes(int layers){
        return layers * 2;
    }

    // Total time includes preparation time and time in the oven
    public int totalTimeInMinutes(int layers, int minutesInOven){
        return preparationTimeInMinutes(layers) + minutesInOven;
    }
}
