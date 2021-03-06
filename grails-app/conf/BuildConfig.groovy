grails.project.work.dir = 'target'

grails.project.repos.grailsCentral.username = System.getenv("GRAILS_CENTRAL_USERNAME")
grails.project.repos.grailsCentral.password = System.getenv("GRAILS_CENTRAL_PASSWORD")

grails.project.dependency.resolution = {

    inherits 'global'
    log 'warn'

    repositories {
        grailsCentral()
        mavenLocal()
        mavenCentral()
    }

    dependencies {
        compile('com.lowagie:itext:2.1.7')

        compile('net.sf.jasperreports:jasperreports:5.6.1') {
            excludes 'antlr', 'commons-beanutils', 'commons-collections', 'commons-logging',
                     'ant', 'mondrian', 'commons-javaflow','barbecue', 'xml-apis-ext','xml-apis', 'xalan', 'groovy-all', 'hibernate', 'saaj-api', 'servlet-api',
                     'xercesImpl','xmlParserAPIs','spring-core','bsh', 'spring-beans', 'jaxen', 'barcode4j','batik-svg-dom','batik-xml','batik-awt-util','batik-dom',
                     'batik-css','batik-gvt','batik-script', 'batik-svggen','batik-util','batik-bridge','persistence-api','jdtcore','bcmail-jdk16','bcprov-jdk16','bctsp-jdk16',
                     'bcmail-jdk14','bcprov-jdk14','bctsp-jdk14','xmlbeans', 'olap4j',
                    'lucene-core', 'lucene-analyzers-common', 'lucene-queryparser' // exclude lucene. if it's needed later, user just add it.
        }

        compile('org.apache.poi:poi:3.10-FINAL')
    }

    plugins {
        build ':release:3.0.1', ':rest-client-builder:2.0.3', {
            export = false
        }

        test(":hibernate:3.6.10.16") {
            export = false
        }
        test(":tomcat:7.0.54") {
            export = false
        }
    }
}
