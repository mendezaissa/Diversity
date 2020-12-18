import { Component, OnInit, Renderer2 } from '@angular/core';

@Component({
  selector: 'app-hors',
  templateUrl: './hors.component.html',
  styleUrls: ['./hors.component.css']
})
export class HorsComponent implements OnInit {

  constructor(private renderer: Renderer2) { }

  renderExternalScript(src: string): HTMLScriptElement {
    const script = document.createElement('script');
    script.type = 'text/javascript';
    script.src = src;
    script.async = true;
    script.defer = true;
    this.renderer.appendChild(document.body, script);
    return script;
  }

  ngOnInit(): void {
    this.renderExternalScript('https://public.tableau.com/javascripts/api/viz_v1.js').onload = () => {
    }
  }

}
