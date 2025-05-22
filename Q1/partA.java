public int dogwalker(hour){
    int dawgs = company.num.AvailableDogs(hour);
    if(maxDog>=dawgs){
        company.updateDogs(hour, dawgs);
        return dawgs;
    }
    comapny.updateDogs(hour,maxDog);
    return maxDog


}
