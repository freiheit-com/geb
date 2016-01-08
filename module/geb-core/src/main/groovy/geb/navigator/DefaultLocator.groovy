/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package geb.navigator

import org.openqa.selenium.By

import groovy.util.logging.Slf4j

@Slf4j
class DefaultLocator implements Locator {

    @Delegate
    private final BasicLocator basicLocator

    DefaultLocator(BasicLocator basicLocator) {
        this.basicLocator = basicLocator
    }

    @Override
    Navigator find(String selector) {
        log.info("find(${selector.toString()})", this)
        find(By.cssSelector(selector))
    }

    @Override
    Navigator $(String selector) {
        find(selector)
    }

    @Override
    Navigator find(String selector, int index) {
        log.info("find(${selector.toString()},${index}", this)
        find(selector)[index]
    }

    @Override
    Navigator find(String selector, Range<Integer> range) {
        log.info("find(${selector.toString()},${range})", this)
        find(selector)[range]
    }

    @Override
    Navigator $(String selector, int index) {
        find(selector, index)
    }

    @Override
    Navigator $(String selector, Range<Integer> range) {
        find(selector, range)
    }

    @Override
    Navigator $(Map<String, Object> attributes, By bySelector) {
        find(attributes, bySelector)
    }

    @Override
    Navigator find(Map<String, Object> attributes, By bySelector) {
        log.info("find(${attributes},${bySelector})", this)
        find(bySelector).filter(attributes)
    }

    @Override
    Navigator $(Map<String, Object> attributes, By bySelector, int index) {
        find(attributes, bySelector, index)
    }

    @Override
    Navigator find(Map<String, Object> attributes, By bySelector, int index) {
        log.info("find(${attributes},${bySelector},${index})", this)
        find(attributes, bySelector)[index]
    }

    @Override
    Navigator $(Map<String, Object> attributes, By bySelector, Range<Integer> range) {
        log.info("find(${attributes},${bySelector},${range})", this)
        find(attributes, bySelector, range)
    }

    @Override
    Navigator find(Map<String, Object> attributes, By bySelector, Range<Integer> range) {
        log.info("find(${attributes},${bySelector},${range})", this)
        find(attributes, bySelector)[range]
    }

    @Override
    Navigator $(By bySelector) {
        find(bySelector)
    }

    @Override
    Navigator $(By bySelector, int index) {
        find(bySelector, index)
    }

    @Override
    Navigator find(By bySelector, int index) {
        log.info("find(${bySelector},${index})", this)
        find(bySelector)[index]
    }

    @Override
    Navigator $(By bySelector, Range<Integer> range) {
        find(bySelector, range)
    }

    @Override
    Navigator find(By bySelector, Range<Integer> range) {
        log.info("find(${bySelector},${range})", this)
        find(bySelector)[range]
    }

    @Override
    Navigator $(Map<String, Object> attributes) {
        find(attributes)
    }

    @Override
    Navigator find(Map<String, Object> attributes, int index) {
        log.info("find(${attributes},${index})", this)
        find(attributes)[index]
    }

    @Override
    Navigator find(Map<String, Object> attributes, Range<Integer> range) {
        log.info("find(${attributes},${range})", this)
        find(attributes)[range]
    }

    @Override
    Navigator $(Map<String, Object> attributes, int index) {
        find(attributes, index)
    }

    @Override
    Navigator $(Map<String, Object> attributes, Range<Integer> range) {
        find(attributes, range)
    }

    @Override
    Navigator $(Map<String, Object> attributes, String selector) {
        find(attributes, selector)
    }

    @Override
    Navigator find(Map<String, Object> attributes, String selector, int index) {
        log.info("find(${attributes},${selector.toString()},${index})", this)
        find(attributes, selector)[index]
    }

    @Override
    Navigator find(Map<String, Object> attributes, String selector, Range<Integer> range) {
        log.info("find(${attributes},${selector.toString()},${range})", this)
        find(attributes, selector)[range]
    }

    @Override
    Navigator $(Map<String, Object> attributes, String selector, int index) {
        find(attributes, selector, index)
    }

    @Override
    Navigator $(Map<String, Object> attributes, String selector, Range<Integer> range) {
        find(attributes, selector, range)
    }

    @Override
    Navigator find(Map<String, Object> attributes) {
        log.info("find(${attributes})", this)
        find attributes, MATCH_ALL_SELECTOR
    }
}
