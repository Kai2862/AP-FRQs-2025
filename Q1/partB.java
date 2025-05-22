public int dogWalkShift(int startHour, int endHour) {
    int mula=0;
    for (int hour=startHour; hour<=endHour;hour++) {
        int dogs = walkDogs(hour);
        mula += dogs*5;

        if (dogs==maxDogs||(hour>=9&&hour<= 17)) {
            mula += 3;
        }
    }
    return mula;
