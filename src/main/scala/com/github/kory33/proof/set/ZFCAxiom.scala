package com.github.kory33.proof.set

import com.github.kory33.proof.logic.predicate.PredicateLogicDefinitions.{∃, _}
import com.github.kory33.proof.logic.predicate.PredicateLogicSystem._
import com.github.kory33.proof.logic.propositional.LogicDefinitions._
import com.github.kory33.proof.logic.propositional.IntuitionisticLogicSystem._
import com.github.kory33.proof.set.SetDefinitions._
import com.github.kory33.proof.set.ZFAxiom

trait ZFCAxiom extends ZFAxiom {

  /**
   * For every family F of disjoint nonempty sets there exists a selector S that intersects every x ∈ F in precisely one point.
   */
  def choice: ∀[[F] => (∀∈[F, [x] => ￢[isEmpty[x]]] ∧ ∀∈[F, [x] => ∀∈[F, [y] => (x =#= y) ∨ Disjoint[x, y]]]) => ∃[[S] => ∀∈[F, [x] => ∃![[z] => (z ∈ S) ∧ z ∈ x]]]]

}

object ZFCAxiom {
  def choice(implicit axiom: ZFCAxiom): ∀[[F] => (∀∈[F, [x] => ￢[isEmpty[x]]] ∧ ∀∈[F, [x] => ∀∈[F, [y] => (x =#= y) ∨ Disjoint[x, y]]]) => ∃[[S] => ∀∈[F, [x] => ∃![[z] => (z ∈ S) ∧ z ∈ x]]]] = axiom.choice
}