package com.example.android.reportcard;

/**
 * Created by rmhuneineh on 27/04/2017.
 */

public class ReportCard {

    /**
     * Student name and surname are set as strings.
     */
    private String mName;
    private String mSurname;

    /**
     * The marks/average for the courses that must be taken by the student are set as double and initialized
     * to 0.
     */
    private double mEnglishMark = 0;
    private double mMathMark = 0;
    private double mPhysicsMark = 0;
    private double mChemistryMark = 0;
    private double mBiologyMark = 0;
    private double mGeographyMark = 0;
    private double mHistoryMark = 0;
    private double mAvg;

    /**
     * Average is considered as a weighted average for courses' marks. Weight is an integer and is
     * constant for every subject.
     */
    private int englishWeight = 5;
    private int mathWeight = 7;
    private int physicsWeight = 6;
    private int chemistryWeight = 5;
    private int biologyWeight = 6;
    private int geographyWeight = 3;
    private int historyWeight = 3;

    /**
     * Constructor only requires student's name and surname
     * @param name
     * @param surname
     */
    public ReportCard(String name, String surname){
        mName = name;
        mSurname = surname;
    }

    /**
     * Setters set the mark of the student for each subject alone.
     */
    public void setEnglishMark(double mark) { mEnglishMark = mark; }
    public void setMathMark(double mark) { mMathMark = mark; }
    public void setPhysicsMark(double mark) { mPhysicsMark = mark; }
    public void setChemistryMark(double mark) { mChemistryMark = mark; }
    public void setBiologyMark(double mark) { mBiologyMark = mark; }
    public void setGeographyMark(double mark) { mGeographyMark = mark; }
    public void setHistoryMark(double mark) { mHistoryMark = mark; }


    /**
     * Getters
     * @return
     */
    public String getName(){ return mName; }
    public String getSurname(){ return mSurname; }
    public double getEnglishMark(){ return mEnglishMark; }
    public double getMathMark(){ return mMathMark; }
    public double getPhysicsMark(){ return mPhysicsMark; }
    public double getChemistryMark(){ return mChemistryMark; }
    public double getBiologyMark(){ return mBiologyMark; }
    public double getGeographyMark(){ return mGeographyMark; }
    public double getHistoryMark(){ return mHistoryMark; }
    public double getAverage(){
        double totalScore = mEnglishMark*englishWeight +
                mMathMark*mathWeight +
                mPhysicsMark*physicsWeight +
                mChemistryMark*chemistryWeight +
                mBiologyMark*biologyWeight +
                mGeographyMark*geographyWeight +
                mHistoryMark*historyWeight;

        int totalWeight = englishWeight + mathWeight + physicsWeight + chemistryWeight + biologyWeight +
                geographyWeight + historyWeight;

        mAvg = totalScore/totalWeight;

        return mAvg;
    }

    @Override
    public String toString(){
        String result = mName + " " + mSurname + "\'s Average = " + mAvg;

        return result;
    }
}
