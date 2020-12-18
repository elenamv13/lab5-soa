# Web Engineering 2020-2021 / SOA
**In this assignment your PR must only modify the `README.md` file**.
Please, go to the [Wiki](https://github.com/UNIZAR-30246-WebEngineering/lab5-soa/wiki) in order to get the instructions for this assignment.

## Primary goal

The objective is to extend the query interface to support the command `max:n`, where _n_ is a number. 
`max` sets a limit in the number of retrieved tweets.
That is `cool max:10` must return at most 10 tweets. 
There are several ways to do it. 
You can use the parameter `q` or create additional parameters. 
There is a restriction. 
You must explicitly tell the API Twitter to enforce such a limit. 
Read the documentation of the [Twitter Search component](https://camel.apache.org/components/latest/twitter-search-component.html) of Apache Camel to discover how.

You need to [apply for a free Twitter developer account](https://developer.twitter.com/en/apply-for-access).
Do not add `application.properties` with the Twitter tokens to your git!

Note: the Twitter Search endpoint is configured using URI syntax `twitter-search:{string}[?param=value[&param=value]*]`

## Secondary goals (:gift:)

In progress:

- [Create an operator "-" to filter out tweets that contain a keyword](https://camel.apache.org/components/latest/eips/filter-eip.html) 
- [Use Camel for keeping a copy of responses in a database](https://camel.apache.org/components/latest/jdbc-component.html)

Proposed:

- [Use Camel for providing a REST endpoint for queries](https://camel.apache.org/components/latest/rest-component.html); current client should work.
- [Use Camel for providing a WebSocked endpoint for queries](https://camel.apache.org/components/latest/websocket-jsr356-component.html); a websocket client is required.
- [Enrich the response with moustache](https://camel.apache.org/components/latest/eips/content-enricher.html); remove moustache from the client.
- [Throttle the route to avoid be banned by Twitter](https://camel.apache.org/components/latest/eips/throttle-eip.html)

The link provides one of the possible approaches. You can use a different one.

The possibilities of Camel are endless; you can propose your idea for a :gift:.

Manifest your intention first by a PR updating this `README.md` with your goal.
If you desist of your goal, release it by a PR so other fellow can try it. 

|NIA    | User name | Repo | Improvement | Score  |
|-------|-----------|------|-------------|--------|
| 758267 | [Pedro Allué](https://github.com/piter1902) |  [piter1902/lab5-soa](https://github.com/piter1902/lab5-soa/tree/test)    |             |        | 
| 760704 | [Álvaro García](https://github.com/Alvarogd6) | [Alvarogd6/lab5-soa](https://github.com/Alvarogd6/lab5-soa/tree/test) |    |    | 
| 757755 | [Andrés Otero García](https://github.com/andrewknoll) |  [andrewknoll/lab5-soa](https://github.com/andrewknoll/lab5-soa/tree/test)    |[Create an operator "-" to filter out tweets that contain a keyword](https://camel.apache.org/components/latest/eips/filter-eip.html)             |        | 
| 758906 |[rauljavierre](https://github.com/rauljavierre)|[rauljavierre/lab5-soa](https://github.com/rauljavierre/lab5-soa/tree/test)|[Use Camel for keeping a copy of responses in a database](https://camel.apache.org/components/latest/jdbc-component.html)||
| 739324 | [elenamv13](https://github.com/elenamv13)|[elenamv13/lab5-soa](https://github.com/elenamv13/lab5-soa/tree/test)| | |