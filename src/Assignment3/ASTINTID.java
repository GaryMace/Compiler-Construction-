/* Generated By:JJTree: Do not edit this line. ASTINTID.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package Assignment3;public
class ASTINTID extends SimpleNode {
  private String name;
  public ASTINTID(int id) {
    super(id);
  }

  public ASTINTID(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }

  public void setName(String s) {
    this.name = s;
  }

  public String getName() {
    return this.name;
  }
}
/* JavaCC - OriginalChecksum=54d0ae5e12dd986d25323086a3c813bb (do not edit this line) */
