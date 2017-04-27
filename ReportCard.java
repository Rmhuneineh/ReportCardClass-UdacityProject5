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
    private double mEnglishMark;
    private double mMathMark;
    private double mPhysicsMark;
    private double mChemistryMark;
    private double mBiologyMark;
    private double mGeographyMark;
    private double mHistoryMark;
    private double mAvg;

    /**
     * Average is considered as a weighted average for courses' marks. Weight is an integer and is
     * constant for every subject.
     */
    private final int ENGLISH_WEIGHT = 5;
    private final int MATH_WEIGHT = 7;
    private final int PHYSICS_WEIGHT = 6;
    private final int CHEMISTRY_WEIGHT = 5;
    private final int BIOLOGY_WEIGHT = 6;
    private final int GEOGRAPHY_WEIGHT = 3;
    private final int HISTORY_WEIGHT = 3;

    /**
     * Constructor only requires student's name and surname
     * @param name student name
     * @param surname student surname
     * @param englishMark student english mark
     * @param mathMark student math mark
     * @param physicsMark student physics mark
     * @param chemistryMark student chemistry mark
     * @param biologyMark student biology mark
     * @param geographyMark student geography mark
     * @param historyMark student history mark
     */
    public ReportCard(String name, String surname, double englishMark, double mathMark, double physicsMark,
                      double chemistryMark, double biologyMark, double geographyMark, double historyMark){
        mName = name;
        mSurname = surname;
        mEnglishMark = englishMark;
        mMathMark = mathMark;
        mPhysicsMark = physicsMark;
        mChemistryMark = chemistryMark;
        mBiologyMark = biologyMark;
        mGeographyMark = geographyMark;
        mHistoryMark = historyMark;


    }

    /**
     * Setters set the mark of the student for each subject alone.
     */
    public void setEnglishMark(double mark) {
        mEnglishMark = mark; }

    public void setMathMark(double mark) {
        mMathMark = mark; }

    public void setPhysicsMark(double mark) {
        mPhysicsMark = mark; }

    public void setChemistryMark(double mark) {
        mChemistryMark = mark; }

    public void setBiologyMark(double mark) {
        mBiologyMark = mark; }

    public void setGeographyMark(double mark) {
        mGeographyMark = mark; }

    public void setHistoryMark(double mark) {
        mHistoryMark = mark; }


    /**
     * Getters
     */
    public String getName(){
        return mName; }

    public String getSurname(){
        return mSurname; }

    public double getEnglishMark(){
        return mEnglishMark; }

    public double getMathMark(){
        return mMathMark; }

    public double getPhysicsMark(){
        return mPhysicsMark; }

    public double getChemistryMark(){
        return mChemistryMark; }

    public double getBiologyMark(){
        return mBiologyMark; }

    public double getGeographyMark(){
        return mGeographyMark; }

    public double getHistoryMark(){
        return mHistoryMark; }

    public double getAverage(){
        double totalScore = mEnglishMark*ENGLISH_WEIGHT +
                mMathMark*MATH_WEIGHT +
                mPhysicsMark*PHYSICS_WEIGHT +
                mChemistryMark*CHEMISTRY_WEIGHT +
                mBiologyMark*BIOLOGY_WEIGHT +
                mGeographyMark*GEOGRAPHY_WEIGHT +
                mHistoryMark*HISTORY_WEIGHT;

        int totalWeight = ENGLISH_WEIGHT + MATH_WEIGHT + PHYSICS_WEIGHT + CHEMISTRY_WEIGHT + BIOLOGY_WEIGHT +
                GEOGRAPHY_WEIGHT + HISTORY_WEIGHT;

        mAvg = totalScore/totalWeight;

        return mAvg;
    }

    @Override
    public String toString(){
        String result = mName + " " + mSurname + "\'s Average = " + mAvg +
                "\nEnglish: " + mEnglishMark +
                "\nMath: " + mMathMark +
                "\nPhysics: " + mPhysicsMark +
                "\nChemistry: " + mChemistryMark +
                "\nBiology: " + mBiologyMark +
                "\nGeography: : " + mGeographyMark +
                "\nHistory: " + mHistoryMark;

        return result;
    }
}
