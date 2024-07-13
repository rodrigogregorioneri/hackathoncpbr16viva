import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AnalyticsStoreComponent } from './analytics-store.component';

describe('AnalyticsStoreComponent', () => {
  let component: AnalyticsStoreComponent;
  let fixture: ComponentFixture<AnalyticsStoreComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AnalyticsStoreComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AnalyticsStoreComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
