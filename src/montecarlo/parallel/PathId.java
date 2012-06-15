/**************************************************************************
*                                                                         *
*         Java Grande Forum Benchmark Suite - Thread Version 1.0          *
*                                                                         *
*                            produced by                                  *
*                                                                         *
*                  Java Grande Benchmarking Project                       *
*                                                                         *
*                                at                                       *
*                                                                         *
*                Edinburgh Parallel Computing Centre                      *
*                                                                         *
*                email: epcc-javagrande@epcc.ed.ac.uk                     *
*                                                                         *
*      Original version of this code by Hon Yau (hwyau@epcc.ed.ac.uk)     *
*                                                                         *
*      This version copyright (c) The University of Edinburgh, 2001.      *
*                         All rights reserved.                            *
*                                                                         *
**************************************************************************/


package montecarlo.parallel;
/**
  * Base class for all the security objects, namely in terms of
  * providing a consistent means of identifying each such object.
  * Also provides some methods for writing out debug messages.
  *
  * @author H W Yau
  * @version $Revision: 1.13 $ $Date: 1999/02/16 18:51:58 $
  */
public class PathId extends Universal {

  //------------------------------------------------------------------------
  // Class variables.
  //------------------------------------------------------------------------
  /**
    * A class variable.
    */
  public static boolean DEBUG=true;
  /**
    * The prompt to write before any debug messages.
    */
  protected static String prompt="PathId> ";

  //------------------------------------------------------------------------
  // Instance variables.
  //------------------------------------------------------------------------
  /**
    * Simple string name.
    */
  private String name;

  /**
    * The start date for the path, in YYYYMMDD format.
    */
  private int startDate=0;
  /**
    * The end date for the path, in YYYYMMDD format.
    */
  private int endDate=0;
  /**
    * The change in time between two successive data values.
    */
  private double dTime=Double.NaN;

  //------------------------------------------------------------------------
  // Constructors.
  //------------------------------------------------------------------------
  /**
    * Default constructor.
    */
  public PathId() {
    super();
    set_prompt(prompt);
    set_DEBUG(DEBUG);
  }

  /**
    * Another constructor.
    *
    * @param name The name for the security to record.
    */
  public PathId(String name) {
    set_prompt(prompt);
    set_DEBUG(DEBUG);
    this.name = name;
  }

  //------------------------------------------------------------------------
  // Methods.
  //------------------------------------------------------------------------
  //------------------------------------------------------------------------
  // Accessor methods for class PathId.
  // Generated by 'makeJavaAccessor.pl' script.  HWY.  20th January 1999.
  //------------------------------------------------------------------------
  /**
    * Accessor method for private instance variable <code>name</code>.
    *
    * @return Value of instance variable <code>name</code>.
    * @exception DemoException thrown if instance variable <code>name</code> is undefined.
    */
  public String get_name() throws DemoException {
    if( this.name == null )
      throw new DemoException("Variable name is undefined!");
    return(this.name);
  }
  /**
    * Set method for private instance variable <code>name</code>.
    *
    * @param name the value to set for the instance variable <code>name</code>.
    */
  public void set_name(String name) {
    this.name = name;
  }
  /**
    * Accessor method for private instance variable <code>startDate</code>.
    *
    * @return Value of instance variable <code>startDate</code>.
    * @exception DemoException thrown if instance variable <code>startDate</code> is undefined.
    */
  public int get_startDate() throws DemoException {
    if( this.startDate == 0 )
      throw new DemoException("Variable startDate is undefined!");
    return(this.startDate);
  }
  /**
    * Set method for private instance variable <code>startDate</code>.
    *
    * @param startDate the value to set for the instance variable <code>startDate</code>.
    */
  public void set_startDate(int startDate) {
    this.startDate = startDate;
  }
  /**
    * Accessor method for private instance variable <code>endDate</code>.
    *
    * @return Value of instance variable <code>endDate</code>.
    * @exception DemoException thrown if instance variable <code>endDate</code> is undefined.
    */
  public int get_endDate() throws DemoException {
    if( this.endDate == 0 )
      throw new DemoException("Variable endDate is undefined!");
    return(this.endDate);
  }
  /**
    * Set method for private instance variable <code>endDate</code>.
    *
    * @param endDate the value to set for the instance variable <code>endDate</code>.
    */
  public void set_endDate(int endDate) {
    this.endDate = endDate;
  }
  /**
    * Accessor method for private instance variable <code>dTime</code>.
    *
    * @return Value of instance variable <code>dTime</code>.
    * @exception DemoException thrown if instance variable <code>dTime</code> is undefined.
    */
  public double get_dTime() throws DemoException {
    if( this.dTime == Double.NaN )
      throw new DemoException("Variable dTime is undefined!");
    return(this.dTime);
  }
  /**
    * Set method for private instance variable <code>dTime</code>.
    *
    * @param dTime the value to set for the instance variable <code>dTime</code>.
    */
  public void set_dTime(double dTime) {
    this.dTime = dTime;
  }
  //------------------------------------------------------------------------
  /**
    * Clone the instance variables in this class, from another instance
    * of this class.
    *
    * @param obj the PathId object from which to copy.
    * @exception DemoException thrown if the values to be copied contain
    *                          any undefined objects.
    */
  public void copyInstanceVariables(PathId obj) throws DemoException{
    this.name      = obj.get_name();
    this.startDate = obj.get_startDate();
    this.endDate   = obj.get_endDate();
    this.dTime     = obj.get_dTime();
  }
  /**
    * Dumps the contents of the fields, to standard-out, for debugging.
    */
  public void dbgDumpFields() {
//    dbgPrintln("name="     +this.name);
//    dbgPrintln("startDate="+this.startDate);
//    dbgPrintln("endDate="  +this.endDate);
//    dbgPrintln("dTime="    +this.dTime);
  }
}

