.class public interface abstract Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/interfaces/RedBoxHandler$ReportCompletedListener;
    }
.end annotation


# virtual methods
.method public abstract handleRedbox(Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;Lcom/facebook/react/devsupport/interfaces/ErrorType;)V
.end method

.method public abstract isReportEnabled()Z
.end method

.method public abstract reportRedbox(Landroid/content/Context;Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/RedBoxHandler$ReportCompletedListener;)V
.end method
