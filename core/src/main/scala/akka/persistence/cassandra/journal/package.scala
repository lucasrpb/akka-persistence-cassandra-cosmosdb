/*
 * Copyright (C) 2016-2020 Lightbend Inc. <https://www.lightbend.com>
 */

package akka.persistence.cassandra

import akka.annotation.InternalApi

package object journal {

  println(Console.MAGENTA_B, "LUCAS dev", Console.RESET)

  /** INTERNAL API */
  @InternalApi private[akka] def partitionNr(sequenceNr: Long, partitionSize: Long): Long =
    (sequenceNr - 1L) / partitionSize
}
