/* Generated By:JJTree: Do not edit this line. ASTInsertClause.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.bigdata.rdf.sail.sparql.ast;

import com.bigdata.rdf.sail.sparql.ast.SimpleNode;
import com.bigdata.rdf.sail.sparql.ast.SyntaxTreeBuilder;
import com.bigdata.rdf.sail.sparql.ast.SyntaxTreeBuilderVisitor;
import com.bigdata.rdf.sail.sparql.ast.VisitorException;

public
class ASTInsertClause extends SimpleNode {
  public ASTInsertClause(int id) {
    super(id);
  }

  public ASTInsertClause(SyntaxTreeBuilder p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SyntaxTreeBuilderVisitor visitor, Object data) throws VisitorException {
    return visitor.visit(this, data);
  }

  private String name;
  public void setName(String name) {
      this.name = name;
  }
  
  public String getName() {
      return name;
  }

  public ASTSelect getSelect() {
      return jjtGetChild(ASTSelect.class);
  }

}
/* JavaCC - OriginalChecksum=9b1899154f40eb6de8ccf8bcfc53513b (do not edit this line) */
