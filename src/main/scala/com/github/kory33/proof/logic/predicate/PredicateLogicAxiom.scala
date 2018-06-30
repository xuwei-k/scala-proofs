package com.github.kory33.proof.logic.predicate

import com.github.kory33.proof.logic.predicate.PredicateLogicDefinitions.{∀, ∃}
import com.github.kory33.proof.logic.propositional.LogicDefinitions.{≣, ￢}

trait PredicateLogicAxiom {

  def axiom1[φ[_], Ψ[_]]: ∀[({ type λ[X] = φ[X] => Ψ[X] })#λ] => ∀[φ] => ∀[Ψ]

  def universal[φ]: φ ≣ ∀[({ type λ[A] = φ })#λ]


  /* With type lambdas:

  def axiom1[φ[_], Ψ[_]]: ∀[X :-> φ[X] => Ψ[X]] => (∀[X :-> φ[X]] => ∀[X :-> Ψ[X]])

  def generalize[φ]: φ => ∀[X :-> φ]

   */

}